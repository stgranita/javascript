
<html>
<html lang="en">
<head>
<title>Form Validation</title>
<style>
body {
    font-family: Arial, sans-serif;
    margin: 20px;
}
input, button {
    margin-top: 10px;
    display: block;
}
 </style>
<script language = "javascript">
function validateForm()
{
var name = new String(document.myForm.name.value);
if (name=="") alert("Name is Required!");
}
</script>
</head>
<body>
<h1>Form Validation</h1>
 <form id="myForm" onsubmit="validateForm()">
 <label for="name">Name:</label>
 <input type="text" id="name" name="name" placeholder = "Enter Your Name">
        <button type="submit">Submit</button>
 </form>
</body>
</html>