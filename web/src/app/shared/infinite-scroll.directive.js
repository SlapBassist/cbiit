(function() {
  'use strict';

  angular
    .module('web')
    .directive('infiniteScroll', infiniteScroll);

  /** @ngInject */
  function infiniteScroll($timeout) {
    return {
      restrict: 'A',
      scope: {
        infiniteScroll: '&'
      },
      link: link
    };

    function link(scope, element) {
      $timeout(function() {
        $(window).scroll(function() {
          if ($(window).scrollTop() + $(window).height() >= $(document).height()) {
            scope.infiniteScroll();
          }
        });
      });

      scope.$on('$destroy', function() {
        $(window).unbind('scroll');
      });
    }
  }

})();
