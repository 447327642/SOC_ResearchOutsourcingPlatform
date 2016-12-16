/*global define */
define([], function () {
    'use strict';
    function dashController($scope, $http, $location, $rootScope, $timeout, projectService) {
        $scope.userName = $rootScope.user.userName;
        $scope.role = $rootScope.user.role;
        // console.log($rootScope.user.role);
        $scope.providerinfo = {
            username: "",
            credential: "",
            researchAreas: "",
            publications: "",
            professionalServices: "",
            university:"",
            keyword:""
        };

        $scope.userinfo = {
            username: "",
            keywords: ""
        };
        $scope.finishedProjects = [];
        $scope.ongoingProjects = [];

        $scope.getUserInfo = function () {
            $http({
                method: 'GET',
                url: '/users/' + $scope.userName + '/serviceuserinfo',
            }).success(function (data, status, headers, config) {
                    $scope.userinfo = data;
                    // console.log(data);
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }

        $scope.getProviderInfo = function () {
            $http({
                method: 'GET',
                url: '/users/' + $scope.userName + '/providerinfo'
            }).success(function (data, status, headers, config) {
                    $scope.providerinfo = data;
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }

        $scope.getProjectByPublisher = function () {
            //role:user
            $http({
                method: 'GET',
                url: '/projects/publisher/' + $scope.userName
            }).success(function (data, status, headers, config) {
                    $scope.finishedProjects = [];
                    $scope.ongoingProjects = [];
                    console.log(data);
                    $timeout(function () {
                        for (var i = 0; i < data.length; i++) {
                            if (data[i].status == 'Finished') {
                                $scope.finishedProjects.push(data[i]);
                            }
                            else {
                                $scope.ongoingProjects.push(data[i]);
                            }
                        }
                    })
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }


        $scope.getProjectByProvider = function () {
            //role:provider
            $http({
                method: 'GET',
                url: '/projects/provider/' + $scope.userName
            }).success(function (data, status, headers, config) {
                    $scope.finishedProjects = [];
                    $scope.ongoingProjects = [];
                    console.log(data);
                    $timeout(function () {
                        for (var i = 0; i < data.length; i++) {
                            if (data[i].status == 'Finished') {
                                $scope.finishedProjects.push(data[i]);
                            }
                            else {
                                $scope.ongoingProjects.push(data[i]);
                            }
                        }
                    })
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }

        $scope.changeProjectStatus = function (newStatus) {
            $http({
                method : 'POST',
                url : '/projects/projectname/'+newStatus.status,
                data: newStatus
            }).success(function(data, status, headers, config) {
                    console.log(data);
                    $scope.getProjectByPublisher();
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }
        
        if ($scope.role == 'serviceUser') {
            $scope.getUserInfo();
            $scope.getProjectByPublisher();
        }
        else {
            $scope.getProviderInfo();
            $scope.getProjectByProvider();
        }
        
        $scope.rate = function (project) {
            projectService.setRatingProject(project.projectName, project.publisher, project.provider);
            $location.path("/rating");
        }
    }

    dashController.$inject = ['$scope', '$http', '$location', '$rootScope', '$timeout', 'projectService'];

    return dashController;
});