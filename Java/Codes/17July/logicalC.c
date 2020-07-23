int printf(const char*, ...);

void main() {

	int a = 10;
	int b = 20;

	//bool is not correct keyword for boolean data type
	_Bool ans;	//Correct keyword and default value is 0;

	ans = a && b;
	printf("%d\n", ans);

	a = 0;
	ans = a && b;
	printf("%d\n", ans);
}
