<html>
<head>
<script language = "javascript">
function sq()
{
var s = parseInt(document.f1.t1.value);
if(document.f1.r1[0].checked)
s = s*s;
else
s = s+s;
document.f1.t2.value = s;
}
</script>
</head>
<body>
<form name = f1 method = "post"><br>
Enter Number:<input type = "text" name = t1><br>
Square:<input type= "radio" name= r1 onClick="sq()">
Double:<input type= "radio" name= r1 onClick="sq()"><br>
Answer:<input type = "text" name = t2>
</form>
</body>
</html>