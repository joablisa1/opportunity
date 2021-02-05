<%--
  Created by IntelliJ IDEA.
  User: Lisa
  Date: 1/27/2021
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
        <div class="sb-sidenav-menu">
            <div class="nav">
                <div class="sb-sidenav-menu-heading">Core</div>
                <a class="nav-link" href="index.html">
                    <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                    Dashboard
                </a>
                <div class="sb-sidenav-menu-heading">Customer</div>
                <a class="nav-link collapsed" href="${pageContext.request.contextPath}/users/detail" data-toggle="collapse" data-target="#collapseLayouts"
                   aria-expanded="false" aria-controls="collapseLayouts">
                    <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                   Users
                    <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                </a>
                <a class="nav-link collapsed" href="${pageContext.request.contextPath}/account/getAccount" data-toggle="collapse" data-target="#collapsePages"
                   aria-expanded="false" aria-controls="collapsePages">
                    <div class="sb-nav-link-icon"><i class="fas fa-book-open"></i></div>
                    Account
                    <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                </a>
                <div class="sb-sidenav-menu-heading">Manage Opportunity</div>
                <a class="nav-link" href="${pageContext.request.contextPath}/opportunity/getAllOpportunities">
                    <div class="sb-nav-link-icon"><i class="fas fa-chart-area"></i></div>
                    Opportunity
                </a>
                <div class="sb-sidenav-menu-heading">Management Role</div>
                <a class="nav-link" href="${pageContext.request.contextPath}/roles/roles">
                    <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                    Roles
                </a>
                <a class="nav-link" href="${pageContext.request.contextPath}/permissions/permissions">
                    <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                    Permissions
                </a>
            </div>
        </div>
    </nav>

</body>
</html>
