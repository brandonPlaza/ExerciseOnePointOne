package sheridan.plazab.exerciseonepointone

/**
 * ExerciseOnePointOne created by brandon
 * student ID: 991568216
 * on 2020-09-19 */
class DominoPiece(n1:Int=1, n2:Int=1){
    var n1:Int = if(n1 in 0..6) n1 else 1
    var n2:Int = if(n2 in 0..6) n2 else 1
}