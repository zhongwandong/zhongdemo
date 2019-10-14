<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
<link href="./css/common/bootstrap.min.css" rel="stylesheet">
 
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="./scripts/common/jquery.min.js"></script>
 <meta name="content-type" content="text/html; charset=utf-8">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="./scripts/common/bootstrap.min.js"></script>
<script src="./scripts/login.js"></script>
<title>钟万栋的校园管理系统</title>
</head>
<body>
    <div class="container">
		<div class="row">
			<div class="col-md-12">
				<form action="login/check.action" method="post" class="form-horizontal"  onsubmit="return check(this)">
					<fieldset>
						<legend><label>用户登录</label></legend>
						<div class="form-group">
							<label class="col-md-2 control-label" for="mid">用户名：</label>
							<div class="col-md-5">
								<input type="text" id="mid" class="form-control" name="name">
							</div>
							<span class="col-md-5" id="midSpan">*</span>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="password">密码：</label>
							<div class="col-md-5">
								<input type="password" id="ipassword" class="form-control" name="password">
							</div>
							<span class="col-md-5" id="passwordSpan">*</span>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label" for="sex">性别：</label>
							<div class="col-md-5">
								<div class="radio-inline">
									<input type="radio" id="sex" name="gender" checked value="男">男
								</div>
								<div class="radio-inline">
									<input type="radio" id="sex" name="gender" value="女">女
								</div>
							</div>
							<span class="col-md-5" id="sexSpan">*</span>
						</div>
						<!-- <div class="form-group">
							<label class="col-md-2 control-label" for="lock">锁定：</label>
							<div class="col-md-5">
								<div class="checkbox">
									<label><input type="checkbox" id="lock" name="lock" checked>锁定</label>
								</div>
							</div>
							<span class="col-md-5" id="sexSpan">*</span>
						</div> -->
						<!-- <div class="form-group">
							<label class="col-md-2 control-label" for="city">城市：</label>
							<div class="col-md-5">
								<select id="city" class="form-control" name="city">
									<option value="">北京</option>	
									<option value="">天津</option>
									<option value="">南京</option>	
								</select>
							</div>
							<span class="col-md-5" id="sexSpan">*</span>
						</div> -->
						<div class="form-group">
							<div class="col-md-3 col-md-offset-3">
								<input type="submit" value="提交" class="btn btn-primary">
								<input type="reset" value="重置" class="btn btn-warning">
							</div>
						</div>
					</fieldset>
				</form>
				
				<form name="serForm" action="login/upload.action" method="post"  enctype="multipart/form-data">
					<h1>采用流的方式上传文件</h1>
					<div class="col-md-5">
						<input type="file" name="file">
					</div>
					<div class="form-group">
							<div class="col-md-3 col-md-offset-3">
								<input type="submit" value="上传" class="btn btn-primary">
								<input type="reset" value="重置" class="btn btn-warning">
							</div>
						</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
