/*global define */

'use strict';

define([
    'services/projectService'
], function(projectService) {

    var services = {};

    services.projectService = projectService;

    return services;

});