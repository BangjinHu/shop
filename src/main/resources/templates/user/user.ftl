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
                        <div class="panel-heading">
                            <h2 style="float: left;"><i class="fa fa-table red"></i><span class="break"></span><strong>已预约课程</strong></h2>
                        </div>

                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-hover" id="user_table">
                                    <thead>
                                    <tr>
                                        <th>编号</th>
                                        <th>账户</th>
                                        <th>地址</th>
                                        <th>电话</th>
                                        <th>姓名</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <#list userList as user>
                                        <tbody>
                                        <tr>
                                            <th>${user.id}</th>
                                            <td>${user.account}</td>
                                            <td>${user.address}</td>
                                            <td>${user.phone}</td>
                                            <td>${user.userName}</td>
                                            <td>
                                                <input type="hidden" name="id" id="id" value="${user.id}">
                                                <a href="#" class="btn btn-success" title="修改"><i class="fa fa-edit"></i></a>
                                                <a href="#" class="btn btn-danger" title="删除"><i class="fa fa-trash-o "></i></a>
                                            </td>
                                        </tr>
                                        </tbody>
                                    </#list>
                                </table>
                            </div>
                        </div>

                        <div class="panel-footer">
                            <a href="#" class="btn btn-success"><i class="fa fa-plus"></i> 添加用户</a>
                        </div>
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

<div class="modal fade" id="estimate-modal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">课程评价</h4>
            </div>
            <div class="modal-body">
                <input type="hidden" name="hidden-id" id="hidden-id" value="">
                <div class="form-group">
                    <label class="col-md-2 control-label" for="hidden-estimate">评价*：</label>
                    <div class="col-md-2">
                        <select id="hidden-estimate" name="hidden-estimate" class="form-control">
                            <option value="0">优秀</option>
                            <option value="1">良好</option>
                            <option value="2">合格</option>
                            <option value="3">不合格</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-12 control-label" for="hidden-estimateContent">内容*：</label>
                    <div class="col-md-12">
                        <textarea id="hidden-estimateContent" name="hidden-estimateContent" class="form-control" rows="9" placeholder="请填写课程评价内容，字数不能超过200！"></textarea>
                    </div>
                </div>
            </div>
            <br>
            <br>
            <br>
            <div class="modal-footer">
                <input type="hidden" id="hide-id" value="">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="btn-estimate-commit">确定</button>
            </div>
        </div>
    </div>
</div>

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
<script type="text/javascript">
    $(function() {
        $.fn.dataTable.ext.errMode='none'; //禁止datatables报错

        var $modal = $('#myModal');
        var $p = $modal.find('p');

        $('#appointment_result_table').on('click', 'a.btn-danger', function(event) {
            event.preventDefault();
            var id = $(this).siblings('input').val();
            if (id) {
                $modal.find('h4').html("确认删除该课程意向？");
                $modal.find('.modal-body').html("请谨慎操作!").css('color', '#ff5454');
                $modal.find('#hide-id').val(id);
                $modal.modal('show');
            }
        });

        $('#btn-commit').on('click', function(event) {
            event.preventDefault();
            var id = $modal.find('#hide-id').val();
            if (id) {
                $.get('appointment_result/dlt/' + id, function(data) {
                    if (data['code'] == 0) {
                        $modal.find('.modal-body').html("删除成功，即将跳转到列表").css('color', '#4a7d28');;
                    } else {
                        $modal.find('.modal-body').html("删除失败，原因未知，请重试!");
                    }
                    setTimeout(function() {
                        $modal.modal('hide');
                        window.location.href = "appointment_result";
                    }, 2000);
                });
            }
        });

        $('.btn-estimate').on('click', function (event) {
            event.preventDefault();
            var id = $(this).prev().val();
            var estimate_modal = $('#estimate-modal');
            estimate_modal.find('input').val(id);
            estimate_modal.modal('show');
        });

        $('#btn-estimate-commit').on('click', function (event) {
            event.preventDefault();
            var estimateContent = $('#hidden-estimateContent').val();
            if (estimateContent.length > 200){
                alert("字数超过200，请删减！");
            }

            $.post(
                '/student/appointment_result/modify/do',
                {
                    id: $('#hidden-id').val(),
                    estimate: $('#hidden-estimate').val(),
                    estimateContent: $('#hidden-estimateContent').val()
                },
                function(data, textStatus, xhr) {
                    if (data.code == 0){
                        $p.html('评论成功，正在跳转！');
                        setTimeout(function () {
                            $modal.modal('hide');
                            window.location.href='/student/appointment_result';
                        },2000);
                    }else {
                        $p.html('评论失败'+data.info);
                    }
                }
            );
        });

        $('#user_table').DataTable({
            "pagingType": "full_numbers",
            "processing": true,
            "columnDefs": [
                {
                    "targets":[],
                    "searchable": false
                },
                {
                    "targets": [],
                    "orderable": false
                },
                {
                    "targets": [],
                    "visible": false
                }
            ],
            "oLanguage" : {
                "sLengthMenu": "每页显示 _MENU_ 条记录",
                "sZeroRecords": "抱歉， 没有找到",
                "sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
                "sInfoEmpty": "没有数据",
                "sInfoFiltered": "(从 _MAX_ 条数据中检索)",
                "sZeroRecords": "没有检索到数据",
                "sSearch": "全文搜索:",
                "sProcessing": "<img src='${request.contextPath}/static/img/loading.gif'/> 正在加载数据...",
                "oPaginate": {
                    "sFirst": "首页",
                    "sPrevious": "前一页",
                    "sNext": "后一页",
                    "sLast": "尾页",
                    "sJump": "跳转"
                }
            }
        });
    });

</script>
</html>