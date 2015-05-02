package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SnakeCamelTest {
	
	@Test
	public void toSnake_Abc() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc";
		String actual = snake.camelToSnakecase("Abc");
		assertThat(actual,is(expected));
	}
	@Test
	public void toCamel_abc() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = snake.snakeToCamelcase("abc");
		assertThat(actual,is(expected));
	}
	@Test
	public void toSnake_abcdefgh() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = snake.camelToSnakecase("AbcDefGh");
		assertThat(actual,is(expected));
	}
	@Test
	public void toCamel_AbcDerGh() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = snake.snakeToCamelcase("abc_def_gh");
		assertThat(actual,is(expected));
	}
	@Test
	public void toCamel先頭に_() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = snake.snakeToCamelcase("_abc_def");
		assertThat(actual,is(expected));
	}	

	@Test
	public void toCamel_がふたつ() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = snake.snakeToCamelcase("abc__def___gh");
		assertThat(actual,is(expected));
	}	
	
	@Test
	public void capitalize空文字(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "";
		String actual = snake.capitalize("");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalizeの空文字(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "";
		String actual = snake.uncapitalize("");
		assertThat(actual,is(expected));
	}
	@Test
	public void capitalize一文字(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "A";
		String actual = snake.capitalize("a");
		assertThat(actual,is(expected));
	}
	@Test
	public void capitalize三文字(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = snake.capitalize("xyz");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalize三文字(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = snake.uncapitalize("Xyz");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalizeの一文字(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "a";
		String actual = snake.uncapitalize("A");
		assertThat(actual,is(expected));
	}

	@Test
	public void toSnake適当文字列の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = snake.camelToSnakecase("AbcDef");
		assertThat(actual,is(expected));
	}
	@Test
	public void toCamel適当な文字列の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = snake.snakeToCamelcase("abc_def");
		assertThat(actual,is(expected));
	}	
	@Test
	public void toSnake数字の入った文字列の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc_def1";
		String actual = snake.camelToSnakecase("AbcDef1");
		assertThat(actual,is(expected));
	}
	@Test
	public void toCamel数字の入った文字列の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDef1";
		String actual = snake.snakeToCamelcase("abc_def1");
		assertThat(actual,is(expected));
	}
	@Test
	public void toSnake全角の入った文字列の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc_defあ";
		String actual = snake.camelToSnakecase("AbcDefあ");
		assertThat(actual,is(expected));
	}
	@Test
	public void toCamel全角の入った文字列の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDefあ";
		String actual = snake.snakeToCamelcase("abc_defあ");
		assertThat(actual,is(expected));
	}
	
}
