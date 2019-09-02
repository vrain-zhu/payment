<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页面</title>

<style type="text/css">
	.form_row{
		padding: 5px 0 5px 0;
		border: green 1px solid;
	}


</style>

</head>
<body>
<form action="payManager/pay" method="post" style="border: 1px red solid;width: 300px;position: absolute;" >
	<div class="form_row">
		<span>订单编号：</span>
		<input type="text" id="order" value="">
	</div>
	<div class="form_row">
		<span>应付金额：</span>
		<input type="text" id="money" value="">
	</div>
	<div class="form_row">
		<span>银行：</span>
		<select>
			<option value="" selected="selected">--请选择--</option>
			<option value="">建设银行</option>
			<option value="">招商银行</option>
			<option value="">邮政银行</option>
			<option value="">民生银行</option>
			<option value="">华夏银行</option>
		</select>
	</div>
	<div class="form_row">
		<input type="submit" title="提交" value=" 提交 "/>
		<input type="reset" title="重置" value=" 重置 "/>
	</div>
</form>
</body>
</html>