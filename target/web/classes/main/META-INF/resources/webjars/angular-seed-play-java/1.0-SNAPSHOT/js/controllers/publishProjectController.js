/*global define */
define([], function() {
    'use strict';
    function editProfileController($scope, $http, $location, $rootScope){
        $scope.userName = $rootScope.user.userName;
        $scope.role = $rootScope.user.role;
        $scope.projectInfo =     {
            projectName: "",
            projectDescription:"",
            requiredExpertise:"",
            begintime:"",
            endtime: "",
            price:"",
            status:"In Market"
        };

        $scope.expertise = [{id:1,'name':'design'}, {id:2,'name':'development'}, {id:3,'name':'proof-reading'},{id:4,'name':'consultant'} ];

        $scope.updateExpertise = function(expertise) {
            $scope.projectInfo.requiredExpertise = expertise;
            console.log($scope.projectInfo.requiredExpertise);
        }

        $scope.publishProject = function() {
            console.log($scope.userName);
            console.log($scope.projectInfo);
            $http({
                method : 'POST',
                url : '/users/'+ $scope.userName + '/publishProject',
                data: $scope.projectInfo
            }).success(function(data, status, headers, config) {
                console.log("Create Project Success!");
                console.log(data);
                $location.path('/dashboard');
                }
            ).error(function (data, status, headers, config) {
                console.log(data);
            });
        }
    }
    editProfileController.$inject=['$scope', '$http', '$location', '$rootScope'];

    return editProfileController;
});