/*global define */
define([], function () {
    'use strict';
    function userInfoController($scope, $http, $location, $rootScope, projectService, $timeout) {
        console.log("user Info controller!");
        $scope.userName = $rootScope.user.userName;
        $scope.role = $rootScope.user.role;

        $scope.checkedUser = {
            userName: ''
        };

        $scope.providerinfo = {
            userName: "NA",
            credential: "NA",
            researchAreas: "NA",
            publications: "NA",
            professionalServices: "NA",
            keyword: "",
            email: ""
        };

        $scope.chatInfo = {
            checkedUser: "",
            chatMessage: ""
        }

        $scope.chats = {};

        $scope.checkedUser.userName = projectService.getUserInfo().userName;
        $scope.chatInfo.checkedUser = projectService.getUserInfo().userName;
        console.log($scope.checkedUser.userName);

//        $scope.rating.user = projectService.getRatingProject().user;
//        $scope.rating.project = projectService.getRatingProject().project;

        $scope.getProviderInfo = function () {
            $http({
                method: 'GET',
                url: '/users/' + $scope.checkedUser.userName + '/providerinfo'
            }).success(function (data, status, headers, config) {
                    $scope.providerinfo = data;
                    console.log(data);
                }
            ).error(function (data, status, headers, config) {
                // console.log(data);
            });
        }
        $scope.myFile = null;
        $scope.uploadFile = function () {
            var fd = new FormData();
            fd.append('file', $scope.myFile);
            $http.post("/files", fd, {
                transformRequest: angular.identity,
                headers: {'Content-Type': undefined},
                enctype: "multipart/form-data"
            })

                .success(function () {
                })

                .error(function () {
                });
        }

        $scope.sendChat = function () {
            $http({
                method : 'POST',
                url : '/sendChat/'+ $scope.userName,
                data: $scope.chatInfo
            }).success(function(data, status, headers, config) {
                    console.log(data);
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });

            $scope.showChat();
        }

        $scope.showChat = function() {
            $http({
                method : 'GET',
                url : '/getChat/'+ $scope.userName + '/' + $scope.checkedUser.userName
            }).success(function(data, status, headers, config) {
                    $scope.chats = data;
                    console.log(data);
                }

            ).error(function (data, status, headers, config) {
                // console.log(data);
            });
        }

        $scope.getProviderInfo();

        // Function to replicate setInterval using $timeout service.
          $scope.intervalFunction = function(){
            $timeout(function() {
              $scope.showChat();
              $scope.intervalFunction();
            }, 1000)
          };

          // Kick off the interval
          $scope.intervalFunction();

    }

    userInfoController.$inject = ['$scope', '$http', '$location', '$rootScope', 'projectService', '$timeout'];

    return userInfoController;
});