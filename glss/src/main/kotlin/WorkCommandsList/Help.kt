package WorkCommandsList
import ProgrammRootFile.*

class Help {
    companion object{
        fun help(){
            println(" ")

            println(" ** help : вывести справку по доступным командам")
            println(" ** info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)")
            println(" ** show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении")
            println(" ** add {element} : добавить новый элемент в коллекцию")
            println(" ** update id {element} : обновить значение элемента коллекции, id которого равен заданному")
            println(" ** remove_by_id id : удалить элемент из коллекции по его id")
            println(" ** clear : очистить коллекцию")
            println(" ** save : сохранить коллекцию в файл")
            println(" ** execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.")
            println(" ** exit : завершить программу (без сохранения в файл)")
            println(" ** remove_first : удалить первый элемент из коллекции")
            println(" ** add_if_max {element} : добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции")
            println(" ** history : вывести последние 14 команд (без их аргументов)")
            println(" ** remove_all_by_distance distance : удалить из коллекции все элементы, значение поля distance которого эквивалентно заданному")
            println(" ** average_of_distance : вывести среднее значение поля distance для всех элементов коллекции")
            println(" ** filter_less_than_distance distance : вывести элементы, значение поля distance которых меньше заданного")

            println(" ")
        }
    }
}