package br.com.connectrescuedanimal.demo.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}
