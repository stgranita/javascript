<html>
<head>
<script language = "javascript">
function marks()
{
var name = new Array(3);
var per = new Array(3);
var i;
for(i=0;i<3;i++)
{
name[i] = prompt("Enter name:");
per[i] = prompt("Enter marks");
per[i] = parseInt(per[i]);
}
for(i=0;i<3;i++)
{
for(j=i+1;j<3;j++)
{
if(per[i]<per[j])
{
var x =per[i];
var n = name[i];
name[i] = name[j];
per[i] = per[j];
per[j] = x;
name[j] = n;
}
}
}
for(i=0;i<3;i++) { alert(name[i]);alert(per[i]);}
}
</script>
</head>
<body>
<form name = f1 method = "post">
<input type = "button" name = b1 value = "SORT" onClick = "marks()">
</form>
</body>
</html>