/*global define */
define([], function() {
    'use strict';
    function editProfileController($scope, $http, $location, $rootScope){
        $scope.userName = $rootScope.user.userName;
        $scope.role = $rootScope.user.role;
        // console.log($rootScope.user.role);
        $scope.providerinfo = {
            userName:"NA",
            credential: "NA",
            researchAreas:"NA",
            publications:"NA",
            professionalServices:"NA",
            keyword:"",
            university:""
        };
        $scope.userinfo = {
            keywords:""
        };

        $scope.getUserInfo = function() {
            $http({
                method : 'GET',
                url : '/users/'+ $scope.userName + '/serviceuserinfo',
            }).success(function(data, status, headers, config) {
                    $scope.userinfo = data;
                    // console.log(data);
                }

            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }

        $scope.updateUserInfo = function() {
            $http({
                method : 'POST',
                url : '/users/'+ $scope.userName + '/serviceuserinfo',
                data: $scope.userinfo
            }).success(function(data, status, headers, config) {
                    console.log(data);
                    $location.path('/dashboard');
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }

        $scope.getProviderInfo = function() {
            $http({
                method : 'GET',
                url : '/users/'+ $scope.userName + '/providerinfo'
            }).success(function(data, status, headers, config) {
                    $scope.providerinfo = data;
                    console.log(data);
                }

            ).error(function (data, status, headers, config) {
                // console.log(data);
            });
        }

        $scope.updateProviderInfo = function() {
            console.log("POST updateProviderInfo");
            console.log($scope.providerinfo);
            $http({
                method : 'POST',
                url : '/users/'+ $scope.userName + '/providerinfo',
                data: $scope.providerinfo
            }).success(function(data, status, headers, config) {
                console.log(data);
                $location.path('/dashboard');
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }

        if($scope.role == 'serviceUser'){
            $scope.getUserInfo();
        }
        else{
            $scope.getProviderInfo();
        }
    }
    editProfileController.$inject=['$scope', '$http', '$location', '$rootScope'];

    return editProfileController;
});