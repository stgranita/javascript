<html>
<head>
<script language = "javascript">
var cnt =1;
function start()
{ 
document.f1.t1.value = cnt;
cnt++;
obj = window.setTimeout(strt,1000);
Window.status = "START";}
function stop()
{window.clearTimeout(obj);
cnt = 1; 
Window.status = "STOP";}
function status()
{ Window.status = "HOME PAGE";}
function right()
{
if(event.Which == 3)
alert("Wrong button click!");
}

</script>
</head>
<body onMousedown = "right()" onMouseOver = "status()">
<center>
<ahref = "D:\MCA\cv.doc" onMouseOver = "start()">START</a>
<ahref = "D:\MCA\MB303.doc" onMouseOver = "stop()">STOP</a>
</center>
</body>
</html>