<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Register Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(to bottom right, #4facfe, #00f2fe);
        }

        .container {
            width: 100%;
            max-width: 400px;
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        }

        .container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #555;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        .form-group input:focus {
            outline: none;
            border-color: #4facfe;
            box-shadow: 0 0 5px rgba(79, 172, 254, 0.5);
        }

        .form-group .error {
            color: red;
            font-size: 14px;
            margin-top: 5px;
        }

        .form-group button {
            width: 100%;
            padding: 10px;
            background: #4facfe;
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background 0.3s;
        }

        .form-group button:hover {
            background: #3c9bf2;
        }

        @media (max-width: 600px) {
            .container {
                padding: 15px;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Register</h2>
        <form  action="Register" id="registerForm"  method = "post">
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" id="name" name="name" required>
                <div class="error" id="nameError"></div>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" required>
                <div class="error" id="emailError"></div>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
                <div class="error" id="passwordError"></div>
            </div>
            <div class="form-group">
                <label for="address">Address</label>
                <input type="text" id="address" name="address" required>
                <div class="error" id="addressError"></div>
            </div>
            <div class="form-group">
                <label for="mobile">Mobile</label>
                <input type="tel" id="mobile" name="mobile" required>
                <div class="error" id="mobileError"></div>
            </div>
            <div class="form-group">
                <input type ="submit" value = "Register">
            </div>
        </form>
    </div>

</body>
</html>
