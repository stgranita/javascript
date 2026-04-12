<html>
<head>
<script language = "javascript">
function valid()
{
var s = new String(document.f1.t1.value);
var cnt, flag = "t";
cnt = s.indexOf("@");
if(cnt == -1)
  flag = "f";
else
  if(s.indexOf("@",++cnt) != -1)
  flag = "f";
cnt = s.indexOf(".");
if(cnt == -1)
  flag = "f";
else
  if(s.indexOf(".",++cnt)!=-1)
  flag = "f"; 
if(flag == "f")
alert("Invalid E-mail ID:!" + document.f1.t1.value);
else
alert("valid E-mail ID!" + document.f1.t1.value);
}
</script>
</head>
<body>
<form name = f1 method ="post">
<input type = text name = t1>
<input type = "button" name = "b1" value = "CHECK" onClick= "valid()">
</form>
</body>
</html>

