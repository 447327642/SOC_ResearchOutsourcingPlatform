/*global define */
define([], function() {
    'use strict';
    function editProfileController($scope, $http, $location, $rootScope, projectService){
        console.log("All Providers controller");
        $scope.userName = $rootScope.user.userName;
        $scope.role = $rootScope.user.role;
        // console.log($rootScope.user.role);

        // Mock Data: Test for all projects
        $scope.allProviders =[];
        $scope.allUsers = [];

        $scope.getAllProviders = function() {
            $http({
                method : 'GET',
                url : '/users/getAllProviders'
            }).success(function(data, status, headers, config) {
                    $scope.allProviders = data;
                    console.log($scope.allProviders);
                }

            ).error(function (data, status, headers, config) {
                 console.log(data);
            });
        }

        $scope.getAllUsers = function() {
            $http({
                method : 'GET',
                url : '/serviceusers'
            }).success(function(data, status, headers, config) {
                    $scope.allUsers = data;
                    console.log(data);
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }

        $scope.getAllProviders();
        $scope.getAllUsers();


        $scope.checkUser = function (username) {
            projectService.setUserInfo(username);
            $location.path("/userInfo");
        }
    }
    editProfileController.$inject=['$scope', '$http', '$location', '$rootScope', 'projectService'];

    return editProfileController;
});