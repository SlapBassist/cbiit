(function() {
  'use strict';

  angular
    .module('web')
    .config(routerConfig);

  /** @ngInject */
  function routerConfig($stateProvider, $urlRouterProvider) {
    $stateProvider
      .state('home', {
        url: '/',
        templateUrl: 'app/home/index.html',
        resolve: {
          /** @ngInject */
          clinicalTrials: function(clinicalTrialService) {
            return clinicalTrialService.list(1, 50);
          }
        },
        controller: 'HomeController',
        controllerAs: 'vm'
      });

    $urlRouterProvider.otherwise('/');
  }

})();
