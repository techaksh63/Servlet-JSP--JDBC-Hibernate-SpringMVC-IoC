<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="main.DatabaseConnection"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>
<%
   DatabaseConnection db = new DatabaseConnection();
   Connection connection = db.StartConnection();
   PrintWriter out1 = response.getWriter();
   PreparedStatement allData = connection.prepareStatement("SELECT * FROM Aksh_Schema.Client;");
   ResultSet rs = allData.executeQuery();
%>
<html>
<style>
/* style.css */
body {
	display: flex;
	align-items: center;
	justify-content: center;
	font-family: sans-serif;
	line-height: 1.5;
	min-height: 100vh;
	background: #f3f3f3;
	flex-direction: column;
	margin: 0;
}

.main {
	background-color: #fff;
	border-radius: 15px;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
	padding: 10px 20px;
	transition: transform 0.2s;
	width: 500px;
	text-align: center;
}

h1 {
	color: #4CAF50;
}

label {
	display: block;
	width: 100%;
	margin-top: 10px;
	margin-bottom: 5px;
	text-align: left;
	color: #555;
	font-weight: bold;
}

#pass {
	color: red;
	font-size: 12px;
}

input {
	display: block;
	width: 100%;
	margin-bottom: 15px;
	padding: 10px;
	box-sizing: border-box;
	border: 1px solid #ddd;
	border-radius: 5px;
}

select {
	display: block;
	width: 100%;
	margin-bottom: 15px;
	padding: 10px;
	box-sizing: border-box;
	border: 1px solid #ddd;
	border-radius: 5px;
}

button {
	padding: 15px;
	border-radius: 10px;
	margin-top: 15px;
	margin-bottom: 15px;
	border: none;
	color: white;
	cursor: pointer;
	background-color: #4CAF50;
	width: 100%;
	font-size: 16px;
}

.wrap {
	display: flex;
	justify-content: center;
	align-items: center;
}

</style>
<body>

 <div class="main">
         <h1>Update your Profile</h1>
         <form action="ClientRegister" method="post">
             <label for="first">Name:</label>
             <input type="text" id="first"
                    name="name"
                    placeholder="Enter your name" required>

             <label for="email">Email:</label>
             <input type="email" id="email"
                    name="email"
                    placeholder="Enter your email" required>

             <label for="password">Password:</label>
             <input type="password" id="password"
                    name="password"
                    placeholder="Enter your password"
                    pattern=
                    "^(?=.*\d)(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9])\S{8,}$" required
                    title="Password must contain at least one number,
                        one alphabet, one symbol, and be at
                        least 8 characters long">

             <label for="mobile">Contact:</label>
             <input type="text" id="mobile"
                    name="mobile"
                    placeholder="Enter your Mobile Number" required
                    maxlength="10">

             <label for="gender">Gender:</label>
             <select id="gender" name="gender" required>
                 <option value="male">Male</option>
                 <option value="female">Female</option>
                 <option value="other">Other</option>
             </select>

             <div class="wrap">
                 <button type="submit" onclick="solve()">
                   Submit
                   </button>
             </div>
         </form>
     </div>
</body>
</html>
