package com.lepucare.xphealth.mine.data.mapper

interface Mapper<I, O> {
    fun map(input: I): O
}