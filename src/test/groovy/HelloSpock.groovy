import spock.lang.*

class HelloSpock extends Specification {
	
	@Unroll({"length of $name is $length"})
	def "spock and his friends" (){		
		expect:
		name.length() == length
		
		where:
		name	| length
		'Bayo' 	| 4
		'Yinka' | 5
		'Ade' 	| 3
	}
}