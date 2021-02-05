<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                        <div class="card shadow-sm">
                            <div class="card-header py-3">
                                <h5 class="m-0  font-weight-lighter text text-primary"> Add New Customer</h5>
                            </div>
                                <div class="card-body">
                                    <form:form action="${pageContext.request.contextPath}/customer/save" method="post" modelAttribute="customer">
                                        <form:hidden path="id"/>
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label class="small mb-1" for="firstName">First Name</label>
                                                <form:input path="firstName" class="form-control" placeholder="Enter first name" />
                                            </div>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label class="small mb-1" for="lastName">Last Name</label>
                                                <form:input path="lastName" class="form-control" placeholder="Enter  last name" />
                                            </div>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label class="small mb-1" for="phone">Phone Number</label>
                                                <form:input path="phone" class="form-control" placeholder="Enter Phone" />
                                            </div>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label class="small mb-1" for="emailAddress">Email:</label>
                                                <form:input path="emailAddress" class="form-control" placeholder="Enter Email" />
                                            </div>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label class="small mb-1" for="password">Password:</label>
                                                <form:password path="password" class="form-control" placeholder="Enter password" />
                                            </div>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label class="small mb-1" for="city">City:</label>
                                                <form:input path="city" class="form-control" placeholder="Enter city" />
                                            </div>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label class="small mb-1" for="state">State:</label>
                                                <form:input path="state"  class="form-control" placeholder="Enter State" />
                                            </div>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label class="small mb-1" for="country">Country:</label>
                                                <form:input path="country" class="form-control" placeholder="Enter country" />
                                            </div>
                                        </div>
                                        <button class="btn btn-outline-primary btn-sm">Register</button>
                                    </form:form>
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
