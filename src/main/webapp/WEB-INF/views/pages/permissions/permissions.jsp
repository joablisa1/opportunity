<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lisa
  Date: 1/26/2021
  Time: 4:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link href="webjars/bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
    <link href="<c:url value="/static/css/styles.css"/>" rel="stylesheet">

</head>
<body class="sb-nav-fixed">
<%@include file="../navbars/header.jsp"%>
<div id="layoutSidenav">
    <div id="layoutSidenav_nav">
        <%@include file="../navbars/sidenav.jsp"%>
    </div>
    <div id="layoutSidenav_content">
        <main>
            <div class="container-fluid">
                <h1 class="mt-4">Dashboard</h1>
                <ol class="breadcrumb mb-4">
                    <li class="breadcrumb-item active">Dashboard</li>
                </ol>
                <div class="row">
                    <div class="col-sm-10">
                        <p class="mb-4"><a href="${pageContext.request.contextPath}/opportunity/new" class="mr-auto btn btn-outline-success"><span class="fa fa-plus"></span> Add Apportunity </a></p>
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                                <h5 class="m-0  font-weight-lighter text text-primary">Permission List</h5>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive-sm ">
                                    <table class="table table-hover table-bordered table-sm  " id="dataTable">
                                        <thead>
                                        <tr>
                                            <th style="width: 10px"><input type="checkbox" id="check-all"></th>
                                            <th>Name</th>
                                            <th>Description</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${permissions}" var="permission">
                                            <tr>
                                                <th scope="row"><input type="checkbox" id="check-all-"></th>
                                                <td>${permission.name}</td>
                                                <td>${permission.description}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <%@include file="../navbars/footer.jsp"%>

    </div>
</div>
<script src="webjars/bootstrap/4.3.1/js/bootstrap.js"></script>
</body>
</html>
