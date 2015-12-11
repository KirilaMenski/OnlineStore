	<div id="login">
	Hello, ${nick_name}!!
		<div class="login_block">
			<ul>
				<li><a id="log_in" href="#">Log in</a></li>
				<li><a href="#">Log Out</a></li>
			</ul>
		</div>
	</div>
	<div id="enter">
		<form action="">
			<p><input type="text" placeholder="nick name" pattern="\D"></p>
			<p><input type="password" placeholder="password"pattern="\w{6,12}"></p>
			<p><a id="registrate" href="#">Registrate</a></p>
			<p><input type="submit" value="Enter"></p>
		</form>
	</div>
	<div id="registration_block"><div id="registration">
		<a id="close_reg" href="#"><img src="jsp/resources/res_image/close.PNG" alt="close"/></a>
		<form action="controller?command=registration" method="post">
			<p><input type="text" name="nick_name" placeholder="nick name"></p>
			<p><input type="text" name="email" placeholder="email"></p>
			<p><input type="password" name="password" placeholder="password"></p>
			<p><input type="password" name="rep_password" placeholder="repeat password"></p>
			<p><input type="submit" value="Registrate"></p>
		</form>
	</div></div>
	<div id="search">
		<input type="text" placeholder="Search on site, for example Acer Aspire"/>
	</div>
	<div class="menu">
		<div id="menu_block">
			<ul>
				<li><a href="controller?command=main">Main</a></li>
				<li id="123"><a href="controller?command=products">Products list</a>
					<ul>
						<li><a href="#">Laptops</a></li>
						<li><a href="#">Computer</a></li>
						<li><a href="#">White goods</a></li>
						<li><a href="#">Accessories</a></li>
						<li><a href="#">Smth else</a></li>
					</ul></li>
				<li><a href="controller?command=profile">Profile</a></li>
			</ul>
		</div>
	</div>