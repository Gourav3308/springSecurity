<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>

    <h2>Registration Form</h2>
    <form method="post">
        <label>Enter Name</label> <br>
        <input type="text" name="name" placeholder="Enter your name" required> <br> <br>
        
        <label>Enter Email</label> <br>
        <input type="email" name="email" placeholder="Enter your email" required> <br> <br>
        
        <label>Enter City</label> <br>
        <input type="text" name="city" placeholder="Enter your city" required> <br> <br>

        <label>Enter Mobile Number</label> <br>
        <input type="text" name="mobile" placeholder="Enter your mobile number" required> <br> <br>
        
        <label>Enter Password</label> <br>
        <input type="password" name="pass" placeholder="Enter your password" required> <br> <br>

        <label>Confirm Password</label> <br>
        <input type="password" name="confirmPass" placeholder="Confirm your password" required> <br> <br>
        
        <input type="submit" value="Register"> 
        <input type="reset" value="Clear">
    </form>

    <p style="color:red;">${error}</p>
    <p style="color:green;">${success}</p>

    <form method="get">
        <button type="submit" formaction="/login">Login</button>
    </form>

</body>
</html>
