name1 = prompt"enter the number"
    name1 = gets.chomp
    name2 = prompt"enter the second name"
    name2 = gets.chomp
    puts"before the swapping" #{name1}
    puts"before the swapping" #{name2}
    name1,name2 = name2,name1
    puts"after the swapping" #{name1}
    puts"after the swapping" #{name2}
    
    