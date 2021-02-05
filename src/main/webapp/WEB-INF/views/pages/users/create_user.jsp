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
                        <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Create New User</h6>
                        </div>
                        <div class="card-body">
                            <form:form role="form" action="${pageContext.request.contextPath}/users/save"  modelAttribute="user"  method="post" >
                                <form:hidden path="id"/>
                                <div class="form-group">
                                    <label for="name" class="col-sm-2 col-sm-2 control-label" >Name:</label>
                                    <div class="col-sm-8">
                                        <form:input path="name" required="required" size="50" class="form-control"  placeholder="Enter  Name" />
                                        <!--  <span id="errlastname" class="alert alert-danger col-lg-8 col-md-8 col-sm-8 col-xs-12">Filed Required.</span>-->
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="email" class="col-sm-2 col-sm-2 control-label" > Email: </label>
                                    <div class="col-sm-8">
                                        <form:input path="email" required="required" size="50" class="form-control"  placeholder="Enter email" />
                                        <!--  <span id="errlastname" class="alert alert-danger col-lg-8 col-md-8 col-sm-8 col-xs-12">Filed Required.</span>-->
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="userpassword" class="col-sm-2 col-sm-2 control-label" > Password: </label>
                                    <div class="col-sm-8">
                                        <form:password path="userpassword" required="required"  class="form-control"  placeholder="Enter userpassword" />
                                        <!--  <span id="errlastname" class="alert alert-danger col-lg-8 col-md-8 col-sm-8 col-xs-12">Filed Required.</span>-->
                                    </div>
                                </div>

                                <div class="form-group">
                                        <%--<label for="roles" class="col-sm-2 col-sm-2 control-label"> Role ID:</label>--%>
                                    <div class="col-sm-8">
                                        <p>
                                            <c:forEach items="${roleList}" var="role">
                                                <input type="checkbox" value="${role.id}"><label>${role.name}</label>
                                            </c:forEach>
                                        </p>
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-outline-success">Submit</button>
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
