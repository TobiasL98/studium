
    // a)
        a = ++b + c-- >>> 1
          | |   |   |   |
          | ++1 /  --2  |
          |  \ /   /    |
          |   \   /     /
          |    \ /     /
          |     +3    /
          |      \   /
           \      >>>4
            \      /
             \    /
               =5
               
    // b)
        a = ++b + c-- >>> 1       mit a = 10,b = 20, c = 30
        
        a neu = 25
        b neu = 21
        c neu = 29   