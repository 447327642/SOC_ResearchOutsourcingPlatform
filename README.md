# 18655-Fall2016-Team4
Team4 Repo

Team Member:
Di Zhu: -- Service publication;
Angela Gao: --- Login:
Fengnan Yue: --- Register users:
Yiting Shen: ---- Service provider Info page:

Purpose:
This project aims to implement a Research Outsourcing Platform leveraging the techniques of Service Oriented Computing (SOC) and Service Oriented Architecture (SOA) to provide services for service providers and users to publish and query specific project.

How to use:
Download the project as a zip, unzip and import it into Play! Framework workspace.

Iteration 1
************************************
Feature Implemented:
1.    Login: Provide a log in page, for service users and service provider (a role selection):
     Login as a service user
     Login as a service provider

2.  Register users: Provide a registration page, allowing for potential service users/providers to register on the platform:
     User id
     Password
     Email
     Security questions

3     Service publication: Provide a service editing page, allowing for individuals and research groups to publish their provided services with the following information:
     Credential (education, job, etc.)
     Research areas
     Publications
     Projects (present + past)
     Professional services to provide (types: consultant, design, development, proof-reading, etc.)

7. Service provider Info page: Provide a page to show the profile of a service provider:
      Credential (education, job, etc.)
      Research areas
      Publications
      Finished projects with rating;
      Ongoing projects
      Professional services to provide (types: consultant, design, development, proof-reading, etc.)



Iteration 2
************************************
Feature Implemented:
4. Publish a service project: Provide a page for service users to request a research service on the platform:
     Project name
     Brief descriptions of the project
     Required expertise
     Time frame requirements
     Offered price

5. Show projects: Provide a page to show projects:
     Finished projects;
     Ongoing projects
     New projects
     Provide sorting facility

8. Service user Info page: Provide a page to show the profile of a service user:
     User id;
     Requested service keywords;
     Finished projects;
     Ongoing projects

9. Change project status: Allow service requests to change the status of a project:
     Change a project from in-market to pending;
     Change a project from pending back to in-market;
     Change a project from pending to on-going;
     Change a project from on-going to finished

****************
6.  Show service providers: Provide a page to show service providers:
    Based on popularity (the number of projects they have finished/are doing);
    Based on ranking;
    Based on expertise (default categories);
    Based on keyword search

10.  Interactions: Allow service providers and service users to communicate over the platform:
     Email-like communication
     Real-time chatting
     File sharing (sending)
     Contract generation (template-based)
     Project progress management (basic e.g., project progress, milestone time set up etc.)

11. Rating: Allow service users to rate a service provider based on his/her experience in the project:
     Rating from 1-5 (5 being very satisfied; 1 being completely not satisfied)
     Write comments on project experience;
     Whether will recommend the service provider 1-5 (5: definitely; 1: definitely not)

12.  Service search: After a service user logs in, provide three ways for them to find interested services:
     Search by keywords: User provides keywords and some parameters such as geo-location, price, popularity, etc.
     Search by topic: Platform will store tree-like professional expertise structure for all contained service providers. Service users can search in the structure for his/her interested topics (nodes), and the system will provide all  service providers associated with the node.
     Search by university: Similar to Option 2 above, while the difference is that users will select particular university and the system will list all service providers affiliated with the university
           ●    Administrator: To prevent abuse and fraudulent activities, administrator can have power to maintain the order of the platform.
           ●    Bug report: Provide a way to allow users/providers to raise issues of the platform:
     Raise a bug
     Show bugs and status
