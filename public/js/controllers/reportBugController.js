/*global define */
define([], function() {
    'use strict';
    function editProfileController($scope, $http, $location, $rootScope){
       console.log("reportBugController");
        $scope.userName = $rootScope.user.userName;
        $scope.role = $rootScope.user.role;
        $scope.bug = {
            bugname:"",
            description: "",
            status:"open"
        };

        $scope.bugs =[];

        $scope.getBugs = function() {
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

        $scope.reportBug = function() {
            $http({
                method : 'POST',
                url : '/bug/report',
                data: $scope.bug
            }).success(function(data, status, headers, config) {
                    console.log(data);
//                    $location.path('/dashboard');
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }

        $scope.getBugs = function() {
            $http({
                method : 'GET',
                url : '/bug'
            }).success(function(data, status, headers, config) {
                   $scope.bugs = data;
                    // console.log(data);
                }

            ).error(function (data, status, headers, config) {
                // console.log(data);
            });
        }

//        $scope.updateProviderInfo = function() {
//            console.log("POST updateProviderInfo");
//            console.log($scope.providerinfo);
//            $http({
//                method : 'POST',
//                url : '/users/'+ $scope.userName + '/providerinfo',
//                data: $scope.providerinfo
//            }).success(function(data, status, headers, config) {
//                console.log(data);
//                $location.path('/dashboard');
//                }
//            ).error(function (data, status, headers, config) {
//                console.log(data);
//            });
//        }


        $scope.getBugs();


    }
    editProfileController.$inject=['$scope', '$http', '$location', '$rootScope'];

    return editProfileController;
});