<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">

function login() 
{
	alert("Hello Login");
	
	var un=document.getElementById("uname").value;
	var ps=document.getElementById("password").value;
	alert(un);
	alert(ps);
	
	var req=new XMLHttpRequest();
	
	var url="http://localhost:9098/getconumeData/"+un+"/"+ps+"";
	req.open("GET",url,true);
	req.send();
	alert("Success");
	
	 req.onreadystatechange=function()
	{
		alert(req.readyState);
		if(req.readyState==4 && req.status==200)
			{
			alert(req.responseText);
			}
	}
 
}
</script>
<body>
UserName
<input type="text" name="un" id="uname">
Password
<input type="text" name="ps" id="pass">
<input type="button" value="login" onclick="login()">
</body>
</html>