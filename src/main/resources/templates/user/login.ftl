<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>西安电子科技大学 - 研究生系统</title>
    <!-- Import google fonts - Heading first/ text second -->
    <!-- <link rel='stylesheet' type='text/css' href='http://fonts.useso.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' /> -->
    <!--[if lt IE 9]>
    <link href="http://fonts.useso.com/css?family=Open+Sans:400" rel="stylesheet" type="text/css" />
    <link href="http://fonts.useso.com/css?family=Open+Sans:700" rel="stylesheet" type="text/css" />
    <link href="http://fonts.useso.com/css?family=Droid+Sans:400" rel="stylesheet" type="text/css" />
    <link href="http://fonts.useso.com/css?family=Droid+Sans:700" rel="stylesheet" type="text/css" />
    <![endif]-->
    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="${request.contextPath}/static/ico/favicon.ico" type="image/x-icon" />
    <!-- Css files -->
    <link href="${request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="${request.contextPath}/static/css/jquery.mmenu.css" rel="stylesheet">
    <link href="${request.contextPath}/static/css/font-awesome.min.css" rel="stylesheet">
    <link href="${request.contextPath}/static/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <link href="${request.contextPath}/static/css/style.min.css" rel="stylesheet">
    <link href="${request.contextPath}/static/css/add-ons.min.css" rel="stylesheet">
    <style>
        footer {
            display: none;
        }
    </style>
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="${request.contextPath}/static/js/html5shiv.min.js"></script>
    <script src="${request.contextPath}/static/js/respond.min.js"></script>
    <![endif]-->
</head>
</head>

<body>
<div class="container-fluid content">

    <div class="row">
        <div id="content" class="col-sm-12 full">
            <div class="row">
                <div class="login-box">
                    <div class="header">
                        西安电子科技大学 - 研究生系统
                    </div>

                    <form class="form-horizontal login" action="login" method="post">
                        <fieldset class="col-sm-12">
                            <div class="form-group">
                                <div class="controls row">
                                    <div class="input-group col-sm-12">
                                        <input type="text" class="form-control" id="username" name="username" placeholder="Username or E-mail" />
                                        <span class="input-group-addon"><i class="fa fa-user"></i></span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="controls row">
                                    <div class="input-group col-sm-12">
                                        <input type="password" class="form-control" id="password" name="password" placeholder="Password" />
                                        <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                    </div>
                                </div>
                            </div>
                            <div class="confirm">
                                <input type="checkbox" name="remember" />
                                <label for="remember"> 记住用户名与密码</label>
                            </div>
                            <div class="row">
                                <button type="submit" class="btn btn-lg btn-primary col-xs-12">登录</button>
                            </div>
                        </fieldset>
                    </form>
                    <div class="clearfix"></div>
                </div>
            </div>
            <!--/row-->
        </div>
    </div>
    <!--/row-->
</div>
<!--/container-->

</body>
<!-- start: JavaScript-->

<!--[if !IE]>-->
<script src="${request.contextPath}/static/js/jquery-2.1.1.min.js"></script>
<!--<![endif]-->

<!--[if IE]>
<script src="${request.contextPath}/static/js/jquery-1.11.1.min.js"></script>
<![endif]-->

<!--[if !IE]>-->
<script type="text/javascript">
    window.jQuery || document.write("<script src='${request.contextPath}/static/js/jquery-2.1.1.min.js'>" + "<" + "/script>");
</script>
<!--<![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='${request.contextPath}/static/js/jquery-1.11.1.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

<script src="${request.contextPath}/static/js/jquery-migrate-1.2.1.min.js"></script>
<script src="${request.contextPath}/static/js/bootstrap.min.js"></script>
<!-- page scripts -->
<!-- theme scripts -->
<script src="${request.contextPath}/static/js/SmoothScroll.js"></script>
<script src="${request.contextPath}/static/js/jquery.mmenu.min.js"></script>
<script src="${request.contextPath}/static/js/core.min.js"></script>

<!-- end: JavaScript-->
</html>
