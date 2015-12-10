<%@ include file="head.jsp"%>
<body>
	<div id="main_block">
		<%@ include file="service_jsp/header.jsp"%>
		<%@ include file="service_jsp/menu.jsp"%>

		<div id="window">
			<div id="products_list">
				<div id="product">
					<table border="1">
						<tr>
							<td rowspan="4" width="200"><img src="jsp/resources/products_image/product1/acer1.jpg" alt="Large image" /></td>
							<td width="700"><b><a href="controller?command=view_product">Acer Aspire 5750G</a></b></td>
						</tr>
						<tr>
							<td>2011</td>
						</tr>
						<tr>
							<td>Acer</td>
						</tr>
						<tr>
							<td>intel-core i3, 500GB HDD, 4GB RAM, NVIDIA@ GEFORCE 610M</td>
						</tr>
					</table>
				</div>
			</div>
			<div id="search_criteria">
				<div id="manufacturer_list">
					<p>
						<b>Manufacturer</b>
					</p>
					<br />
					<p>
						<input type="checkbox" class="manufacturer" name="manufacturer"
							value="Acer">Acer
					</p>
					<p>
						<input type="checkbox" class="manufacturer" name="manufacturer"
							value="Samsung">Samsung
					</p>
					<p>
						<input type="checkbox" class="manufacturer" name="manufacturer"
							value="Lenovo">Lenovo
					</p>
					<p>
						<input type="checkbox" class="manufacturer" name="manufacturer"
							value="Aple">Apple
					</p>
				</div>
				<div id="price">
					<p><b>Price</b></p>
					<br /> <input type="number" class="price" name="from"
						placeholder="from"> <input type="number" class="price"
						name="before" placeholder="before">
				</div>
				<div id="year">
					<p>
						<b>Year</b>
					</p>
					<br />
					<p>
						<input type="checkbox" name="manufacturer" value="Aple">2015
					</p>
					<p>
						<input type="checkbox" name="manufacturer" value="Aple">2014
					</p>
					<p>
						<input type="checkbox" name="manufacturer" value="Aple">2013
					</p>
					<br /> <input type="number" class="year" name="from"
						placeholder="2012"> <input type="number" class="year"
						name="before" placeholder="2015">
				</div>
			</div>
		</div>
		<%@ include file="service_jsp/footer.jsp"%>
	</div>
</body>
</html>