/*global define */
define([], function() {
    'use strict';
    function interactionController($scope, $http, $location, $rootScope, projectService){
        $scope.userName = $rootScope.user.userName;
        $scope.role = $rootScope.user.role;
        // console.log($rootScope.user.role);
        $scope.fileList = [];
        $scope.getFileList = function () {
            $http({
                method : 'POST',
                url : '/allReceivedFiles',
                data: {username:$scope.userName}
            }).success(function(data, status, headers, config) {
                $scope.fileList = data;
            }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }
        $scope.getFileList();
    }
    interactionController.$inject=['$scope', '$http', '$location', '$rootScope', 'projectService'];

    return interactionController;
});