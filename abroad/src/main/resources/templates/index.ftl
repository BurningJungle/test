<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>海外留学生管理系统</title>
<link rel="stylesheet" media="screen" href="./css/css.css" />

</head>
<form action="/User/add" method="post" id="msform">
	<!-- progressbar -->
	<ul id="progressbar">
		<li class="active">Account Setup</li>
		<li>Social Profiles</li>
		<li>Personal Details</li>
	</ul>
	<!-- fieldsets -->
	<fieldset>
		<h2 class="fs-title">Create your account</h2>
		<h3 class="fs-subtitle">This is step 1</h3>
		<input type="text" name="Email" placeholder="Email" />
        <input type="password" name="password" placeholder="Password" id='pw1' onchange='check()'/>
        <input type="password" name="cpass" placeholder="Confirm Password" id='pw2' onchange='check()'/>
        <input type="hidden" name="next" class="next action-button" value="Next" id='sub'/>
	</fieldset>
	<fieldset>
		<h2 class="fs-title">Social Profiles</h2>
		<h3 class="fs-subtitle">Your presence on the social network</h3>
		<select name = "gender">
			<option value = "男">男</option>
			<option value = "女">女</option>
		</select>
		<input type="text" name="phoneNumber" placeholder="Phone Number" />
		<input type="text" name="name" placeholder="Name" />
		<input type="button" name="previous" class="previous action-button" value="Previous" />
		<input type="button" name="next" class="next action-button" value="Next" />
	</fieldset>
	<fieldset>
		<h2 class="fs-title">Personal Details</h2>
		<h3 class="fs-subtitle">We will never sell it</h3>
		<input type="text" name="country" placeholder="Country" />
        <textarea name="address" placeholder="Address"></textarea>
		<input type="text" name="hobby" placeholder="Hobby" />
		<input type="button" name="previous" class="previous action-button" value="Previous" />
        <input type="submit" name="" class="action-button" value="Submit">
	</fieldset>
</form>
<script src="./js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="./js/jquery.easing.min.js" type="text/javascript"></script>
<script src="./js/jQuery.time.js" type="text/javascript"></script>
<br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br>
<script type="text/javascript">
    var p1 = document.getElementById('pw1');
    var p2 = document.getElementById('pw2');
    var sub = document.getElementById('sub');
    function check () {
        console.log("xxx");
        var pass1 = p1.value;
        var pass2 = p2.value;
        if(pass1 == pass2)
        {
            sub.type = 'button';
        }
        else{
            sub.type = 'hidden';
        }
    }
</script>
</body>
</html>