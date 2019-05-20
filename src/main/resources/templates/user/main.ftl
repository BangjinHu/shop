<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>西安电子科技大学 - 研究生系统</title>

    <!-- Fav and touch icons -->
    <link rel="shortcut icon" href="${request.contextPath}/static/ico/favicon.ico" type="image/x-icon" />
    <!-- Css files -->
    <link href="${request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="${request.contextPath}/static/css/jquery.mmenu.css" rel="stylesheet">
    <link href="${request.contextPath}/static/css/font-awesome.min.css" rel="stylesheet">
    <link href="${request.contextPath}/static/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <link href="${request.contextPath}/static/css/style.min.css" rel="stylesheet">
    <link href="${request.contextPath}/static/plugins/jquery.dataTables/css/dataTables.bootstrap.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="${request.contextPath}/static/js/html5shiv.min.js"></script>
    <script src="${request.contextPath}/static/js/respond.min.js"></script>
    <![endif]-->
    <style>
        td > a {
            padding: 5px 10px !important;
            margin-right: 2px;
        }
        input[type=search] {
            width: 300px !important;
        }
        tr > td:last-child {
            min-width: 75px;
        }

        div.dataTables_processing {
            z-index: 9999;
        }
        div.dataTables_processing img {
            width: 100px;
        }
    </style>

</head>

<body>
<#include "${request.contextPath}/user/inc/header.ftl">

<div class="container-fluid content">
    <div class="row">
        <#include "${request.contextPath}/user/inc/menu.ftl">
        <div class="main">
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- modal -->
<div class="modal fade" id="myModal">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title"></h4>
            </div>
            <div class="modal-body">
                <p></p>
            </div>
            <div class="modal-footer">
                <input type="hidden" id="hide-id" value="">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="btn-commit">确定</button>
            </div>
        </div>
    </div>
</div>
<br>
<br>
<br>

<div class="clearfix"></div>

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
<script src="${request.contextPath}/static/plugins/jquery-ui/js/jquery-ui-1.10.4.min.js"></script>
<script src="${request.contextPath}/static/plugins/jquery.dataTables/js/jquery.dataTables.min.js"></script>
<script src="${request.contextPath}/static/plugins/jquery.dataTables/js/dataTables.bootstrap.js"></script>
<!--[if lte IE 8]>
<script language="javascript" type="text/javascript" src="${request.contextPath}/static/plugins/excanvas/excanvas.min.js"></script>
<![endif]-->
<script src="${request.contextPath}/static/plugins/autosize/jquery.autosize.min.js"></script>
<script src="${request.contextPath}/static/plugins/placeholder/jquery.placeholder.min.js"></script>
<!-- theme scripts -->
<script src="${request.contextPath}/static/js/SmoothScroll.js"></script>
<script src="${request.contextPath}/static/js/jquery.mmenu.min.js"></script>
<script src="${request.contextPath}/static/js/core.min.js"></script>
<!-- inline scripts related to this page -->
<script src="${request.contextPath}/static/js/iepatch.js"></script>
<!-- end: JavaScript-->
</body>

</html>