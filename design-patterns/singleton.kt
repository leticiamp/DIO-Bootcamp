class User(val id: Int, val name: String?)

/* 
 * No Kotlin, a declaração de um objeto (por meio da palavra-chave object) 
 * é uma maneira concisa e eficaz de implementar o padrão Singleton.
 */
object UserManager {

  private val users = mutableListOf<User>()

  fun addUser(name: String?) {
    //TODO: Inplementar a lógica de adicionar um novo Usuário na lista "users".
    //Dica: Utilize o tamanho da lista "users" para gerar seus IDs.
    val user = User(users.size+1, name)
    users.add(user)
  }

  fun listUsers() {
    //TODO: Inplementar a impressão/listagem dos "users", seguindo o padrão definido no enunciado.
    //for (i in users) print("$i - $users[i]")
    for (i in users) {
      print(i.id)
      print(" - ")
      print(i.name)
      println()
    }
  }
}

fun main() {
  val quantity = Integer.parseInt(readlnOrNull())

  for (i in 1..quantity) {
    val name = readLine()
    UserManager.addUser(name)
  }

  UserManager.listUsers()
}
