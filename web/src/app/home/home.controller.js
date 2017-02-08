(function() {
  'use strict';

  angular
    .module('web')
    .controller('HomeController', HomeController);

  /** @ngInject */
  function HomeController($timeout, clinicalTrialService, clinicalTrials) {
    var vm = this;

    (function activate() {
      vm.page = 1;
      vm.limit = 50;
      vm.loading = false;

      vm.rows = clinicalTrials;
    })();

    vm.loadMore = function() {
      if (vm.loading) {
        return;
      }

      vm.loading = true;

      vm.page++;

      clinicalTrialService.list(vm.page, vm.limit).then(function(rows) {
        vm.rows = vm.rows.concat(rows);

        vm.loading = false;
      });
    }
  }
})();
