class Solution:
    def squareIsWhite(self, coordinates: str) -> bool:
        black_aplha = "aceg"
        white_aplha = "bdfh"
        
        black_num = "1357"
        white_num = "2468"
        
        if coordinates[0] in black_aplha and coordinates[1] in black_num :
            return False
        elif coordinates[0] in black_aplha and coordinates[1] in white_num :
            return True
        elif coordinates[0] in white_aplha and coordinates[1] in black_num :
            return True
        elif coordinates[0] in white_aplha and coordinates[1] in white_num :
            return False