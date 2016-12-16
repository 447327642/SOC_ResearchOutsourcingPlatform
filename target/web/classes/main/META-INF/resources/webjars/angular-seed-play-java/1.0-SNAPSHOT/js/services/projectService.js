/*global define */

define([], function() {
  'use strict';
/* Services */

// Demonstrate how to register services
// In this case it is a simple value service.
  function projectService() {
      function createProject() {
          var Project = {
              name : 'p1',
              descri: ''
          };
          return Project;
      }
      var ratingProject = {
          project:'',
          provider:'',
          user:''
      }

     var checkedUser = {
        userName:''
     }
        
      return {
          createProject : createProject,
          getRatingProject : function () {
              return ratingProject;
          },
          setRatingProject: function (projectName, publisher, provider) {
              ratingProject.project = projectName;
              ratingProject.provider = provider;
              ratingProject.user = publisher;
          },
          setUserInfo: function (userName) {
               checkedUser.userName = userName;
          },
          getUserInfo : function () {
               return checkedUser;
          }
      };
  }

  return projectService;
});