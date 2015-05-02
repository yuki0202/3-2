package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void toSnake適当な文字の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = snake.camelToSnakecase("AbcDef");
		assertThat(actual,is(expected));
	}
	@Test
	public void toCamel適当な文字の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = snake.snakeToCamelcase("abc_def");
		assertThat(actual,is(expected));
	}	@Test
	public void toSnake数字の入った文字の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc_def1";
		String actual = snake.camelToSnakecase("AbcDef1");
		assertThat(actual,is(expected));
	}
	@Test
	public void toCamel数字の入った文字の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDef1";
		String actual = snake.snakeToCamelcase("abc_def1");
		assertThat(actual,is(expected));
	}
	@Test
	public void toSnake全角の入った文字の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc_defあ";
		String actual = snake.camelToSnakecase("AbcDefあ");
		assertThat(actual,is(expected));
	}
	@Test
	public void toCamel全角の入った文字の比較() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDefあ";
		String actual = snake.snakeToCamelcase("abc_defあ");
		assertThat(actual,is(expected));
	}
	
}
