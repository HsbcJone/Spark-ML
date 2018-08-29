package VectorAndMatrix



import breeze.linalg._
import breeze.numerics._
import org.apache.log4j.{Level, Logger}
/**
  * create by JoneLoveVieech on 2018/8/23
  * version=1.0
  * 1.向量可以是多维的 直角坐标系中式二维  三维 或者四维
  * 2.矩阵式
  */
object VectorMatrix {

  def main(args: Array[String]): Unit = {
    //todo =================创建0矩阵和向量=================
    val m1 = DenseMatrix.zeros[Double](2,3)
    val v1 = DenseVector.zeros[Double](3)
    println(m1)
    println(v1)

    //todo =================创建元素都是1的n维向量=================
    val v2=DenseVector.ones[Double](3)
    println(v2)

    //todo =================创建指定元素的n维向量=================
    val v3=DenseVector.fill(3)(5.0)
    println(v3)

    //todo =================根据范围创建元素的向量(元素和n维由range决定)================
    val v4=DenseVector.range(1,10,2)
    println(v4)


    //todo ================创建对角线为1的矩阵================
     val m2=DenseMatrix.eye[Double](3)
    println(m2)

    //todo ================创建指定对角线元素的矩阵================
    val v6=diag(DenseVector(1.0,2.0,3.0))
    println(v6)

    //todo ================根据向量创建矩阵，每个数组就是一行================
    val m3=DenseMatrix((1.0,2.0),(3.0,4.0))
    println(m3)


    //todo ================ 根据元素创建向量(元素和n维由元素定义)  ===============
    val v8=DenseVector(1,2,3,4)
    println(v8)

    //todo ================ 对元素进行转置  ===============
    val v9=v8.t
    println(v9)

    //todo ================ 根据下标创建向量和矩阵 ===============
    val v10=DenseVector.tabulate(3){i=>2*i}
    val m4=DenseMatrix.tabulate(3,2){case (i,j)=>i+j}
    println(v10)
    println(m4)

    //todo ==============根据数组创建向量和矩阵
    val v11=new DenseVector(Array(1,2,3,4))
    println(v11)
    val m5=new DenseMatrix(2,3,Array(11,12,12,21,21,11))

    //todo ============== 创建一个随机向量和矩阵
    val v12=DenseVector.rand(4)
    val m6=DenseMatrix.rand(2,3)
    println(v12)
    println(m6)
  }
}
