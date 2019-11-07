/*
 ============================================================================
 Name        : other.c
 Author      : Lee Barney
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

#include "junk2.h"

int main(void) {
    puts("!!!Hello other lldb!!!"); /* prints !!!Hello lldb!!! */
	int sum = add(3,4);
	return EXIT_SUCCESS;
}