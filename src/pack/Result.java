package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

import java.awt.*;/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	
import java.awt.event.*;/*Подключаем объект event, который содержит свойства, описывающие некое событие.
Каждый раз, когда происходит какое-либо событие, 
объект Event передается соответствующей программе обработки.
Используемым событием в нашей программе являются ACTION события.
*/
import javax.swing.*;// библиотека для графического интерфейса
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы

public class Result extends JDialog {/*Класс Result, который доступен для любого файла из пакета pack наследует 
	функции элемента JDialog */
	
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {/*  
		Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. 
		static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
		отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
		и переменным можно обращаться через имя класса.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		try {/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
			Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
			Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
			1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
			доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
			 прерывается, и управление прыгает в начало блока catch(err).
			*/
			Result calc_rash_topl = new Result(); 
			calc_rash_topl.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //при закрытии формы происходит выход из приложения
			calc_rash_topl.setVisible(true); //устанавливаем что окно видимое
			calc_topl(); //рассчитваем необходимые данные.
		} catch (Exception e) {
			/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
			Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
			Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
			1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
			доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
			 прерывается, и управление прыгает в начало блока catch(err).
			*/
			e.printStackTrace();
		}
	}

	public static JLabel res_topl, res_price;
	//текстовые поля,доступные из любого файла пакета pack
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
и переменным можно обращаться через имя класса.*/
	
	public Result() {//метод, описывающий какие поля и кнопки располагаются на JDialog

		setTitle("Стоимость поездки"); //устанавливаем заголовок окна
		setSize(300, 280); // указывает ширину и высоту.
		setLocationRelativeTo(null);//установить посередине экрана
		
		getContentPane().setLayout(new BorderLayout());// для данной панели устанавливается менеджер компоновки BorderLayout
		 /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/
		
		JPanel panel = new JPanel(); //Панель на которой располагаются текстовые поля и поля для ввода текста
		JPanel panel_1 = new JPanel();//Панель на которой располагаются кнопки

		add(panel, BorderLayout.CENTER);//Добавление панели panel по центру
		add(panel_1, BorderLayout.SOUTH);//Добавление панели panel_1 снизу

		panel.setBorder(new EmptyBorder(5,10,120,5));//установка внутренних отступов(5 справа и слева,10сверху, 50 снизу)

		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в таблицу */
		panel.setLayout(new GridLayout(2,2,0,5));/* на панеле будет 4 строки, 2 столбца, расстояние между
		 столбцами 0, расстояние между строками 5 */
		panel_1.setLayout(new GridLayout(1,2));//на панели 1 строка,2столбец, будут расположены кнопки
		
		
		JLabel label_1 = new JLabel("Необходимо топлива:", JLabel.LEFT);
		JLabel label_2 = new JLabel("Стоимость поездки:", JLabel.LEFT);
		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.CENTER - выравнивание по центру, RIGHT - по правому краю
		*/

		//создаем текстовые поля для того чтобы в них записывать рассчитанные результаты
		res_topl = new JLabel("", JLabel.RIGHT);
		res_price = new JLabel("", JLabel.RIGHT);
