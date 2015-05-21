package pl.polsl.kojzar.lukasz

class MyShop {
	String name
	String description
	
	static hasMany = [produkty: MyProduct]
	
	static constraints = {
		name blank: false, unique: true
		description maxSize: 1000
	}
}
