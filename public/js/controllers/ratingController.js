/*global define */
define([], function() {
    'use strict';
    function ratingController($scope, $http, $location, $rootScope, projectService){
        $scope.userName = $rootScope.user.userName;
        $scope.role = $rootScope.user.role;
        // console.log($rootScope.user.role);

        $scope.rating ={
            provider:'',
            user:'',
            project:'',
            projectrate:5,
            providerrate:5,
            comment:''
        };

        $scope.contract = {
            project :'',
            provider:'',
            user:'',
            content:'This Contract is made effective as service information, by and between provider and user. User will pay provider upon completion of the service.'
        }

        $scope.rating.provider = projectService.getRatingProject().provider;
        $scope.rating.user = projectService.getRatingProject().user;
        $scope.rating.project = projectService.getRatingProject().project;
        $scope.contract.provider = $scope.userName;
        $scope.contract.user = projectService.getRatingProject().user;
        $scope.contract.project = projectService.getRatingProject().project;
        
        $http({
            method: 'GET',
            url: '/ratings/project/' + $scope.rating.project
        }).success(function (data, status, headers, config) {
           $scope.rating = data;
        }
        ).error(function (data, status, headers, config) {
            console.log(data);
        });

        $scope.submitContract = function () {
            $http({
                method : 'POST',
                url : '/contract',
                data: $scope.contract
            }).success(function(data, status, headers, config) {
                $http({
                    method : 'POST',
                    url : '/projects/provide/'+$scope.userName,
                    data: $scope.contract
                }).success(function(data, status, headers, config) {
                        console.log(data);
                    }
                ).error(function (data, status, headers, config) {
                    console.log(data);
                });
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
            $location.path('/showProject');
        }

        $scope.submit = function () {
            $http({
                method : 'POST',
                url : '/ratings/update',
                data: $scope.rating
            }).success(function(data, status, headers, config) {
                    console.log(data);
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
            console.log($scope.rating);
            $location.path('/dashboard');
        }
    }
    ratingController.$inject=['$scope', '$http', '$location', '$rootScope', 'projectService'];

    return ratingController;
});