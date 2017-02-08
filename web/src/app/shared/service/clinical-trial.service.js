(function() {
  'use strict';

  angular
    .module('web')
    .factory('clinicalTrialService', clinicalTrialService);

  /** @ngInject */
  function clinicalTrialService($log, $http, baseApiUrl) {
    return {
      list: list
    };

    function list(page, limit) {
      return $http.get(baseApiUrl + '/clinicaltrials/?page=' + page + '&limit=' + limit)
        .then(function(response) {
          return response.data;
        }).catch(function(err) {
          $log.error('XHR Failed for list.\n' + angular.toJson(err.data, true));
        });
    }
  }
})();
