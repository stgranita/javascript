<html>
<head>
<script language = "javascript">
function add()
{
var i=0,n,sum=0;
while(confirm("Continue?"))
{
n = prompt("Enter Number:");
sum = sum + parseInt(n);
i = i + 1;
}
document.write("Total =" + sum);
document.write("<Br> Average =" + (sum/i));
}
</script>
</head>
<body onLoad = "add()">
<font color = "Blue"><h1>AVERAGE</h1><hr></font>
</body>
</html>