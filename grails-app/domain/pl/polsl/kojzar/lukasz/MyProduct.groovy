package pl.polsl.kojzar.lukasz

class MyProduct {
	String name
	
	static belongsTo = MyShop
	
	static hasMany = [shops: MyShop]

	static constraints = {
		name blank: false, unique: true
	}
	
	String toString() {return name}
}
