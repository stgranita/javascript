<html>
<title>Avg of even & odd Nos within 1 to 100</title>
<head>
<script language = "javascript">
function avg()
{
var i,cnt1=0,cnt2=0,sum1=0,sum2=0;
for(i=1;i<=100;i++)
{
if(i%2 == 0)
{
sum1 = sum1 + i;
cnt1 = cnt1 + 1;
}
else
{
sum2 = sum2 + i;
cnt2 = cnt2 + 1;
}
}
document.write("Average of even numbers:" + (sum1/cnt1));
document.write("  Average of odd numbers:" + (sum2/cnt2));
}
</script>
</head>
<body onLoad="avg()">
</body>
</html>